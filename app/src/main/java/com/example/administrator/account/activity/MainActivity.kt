package com.example.administrator.account.activity

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.administrator.account.R
import com.example.administrator.account.arouter.Path
import com.example.administrator.account.base.BaseActivity
import com.example.administrator.account.base.BaseFragment
import com.example.administrator.account.fragment.AccountDetailFragment
import com.example.administrator.account.fragment.ChartsFragment
import com.example.administrator.account.fragment.DiscoverFragment
import com.example.administrator.account.fragment.MineFragment
import kotlinx.android.synthetic.main.activity_main.*

@Route(path = Path.main)
class MainActivity : BaseActivity() {

    val TAG_ACCOUNT_DETAIL = "fragment_account_detail"//明细页面
    val TAG_CHARTS = "fragment_charts"//图表页面
    val TAG_DISCOVER = "fragment_discover"//发现页面
    val TAG_MINE = "fragment_mine"//我的页面

    var detailFragment : AccountDetailFragment? = null
    var chartsFragment :ChartsFragment? = null
    var discoverFragment :DiscoverFragment? = null
    var mineFragment :MineFragment? = null

    var fm : FragmentManager? = null


    override fun getLayoutId(): Int = R.layout.activity_main


    //初始化视图
    override fun initView() {
        detailFragment = AccountDetailFragment.newInstance()
        chartsFragment = ChartsFragment.newInstance()
        discoverFragment = DiscoverFragment.newInstance()
        mineFragment = MineFragment.newInstance()
        val fragments = listOf(detailFragment,chartsFragment,discoverFragment,mineFragment)
        fm  = supportFragmentManager
        val ft = fm!!.beginTransaction()
        for (f in fragments){
            ft.add(R.id.rl_container,f)
        }
        ft.hide(detailFragment)
        ft.hide(chartsFragment)
        ft.hide(discoverFragment)
        ft.hide(mineFragment)
        ft.commit()
    }
    //初始化数据
    override fun initData() {

    }
    //绑定事件监听
    override fun bindListener() {
        //底部导航栏的点击事件
        rg_bottom.setOnCheckedChangeListener { radioGroup, id ->
            when(id){
                R.id.rb_detail -> showFragment(detailFragment!!)
                R.id.rb_chart -> showFragment(chartsFragment!!)
                R.id.rb_discover -> showFragment(discoverFragment!!)
                R.id.rb_mine -> showFragment(mineFragment!!)
            }
        }
    }

    private fun showFragment(f : Fragment){
        var ft = fm!!.beginTransaction()
        ft.hide(detailFragment)
        ft.hide(chartsFragment)
        ft.hide(discoverFragment)
        ft.hide(mineFragment)
        ft.show(f)
        ft.commit()
    }

}
