package ph.kodego.aragon.janreign.projectstesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import ph.kodego.aragon.janreign.projectstesting.databinding.ActivityViewPagerBinding

class ViewPagerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewPagerBinding
//    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPagerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var fragmentAdapter = FragmentAdapater(supportFragmentManager, lifecycle)
        fragmentAdapter.addFragement(TodayFragment())
        fragmentAdapter.addFragement(YesterdayFragment())
        fragmentAdapter.addFragement(Last7DaysFragment())
        fragmentAdapter.addFragement(Last30DaysFragment())
        fragmentAdapter.addFragement(CustomFragment())


        with(binding.viewPager2) {
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            adapter = fragmentAdapter
        }

        TabLayoutMediator(binding.tabLayout, binding.viewPager2){
                tab, position ->
        }.attach()
        with(binding.tabLayout) {
            getTabAt(0)!!.text = "Today"
            getTabAt(1)!!.text = "Yesterday"
            getTabAt(2)!!.text = "Last7Days"
            getTabAt(3)!!.text = "Last30Days"
            getTabAt(4)!!.text = "Custom"
        }
    }

    override fun onBackPressed(){
        if(binding.viewPager2.currentItem == 0){
            super.onBackPressed()
        }else{
            binding.viewPager2.currentItem = binding.viewPager2.currentItem - 1
        }
    }
}