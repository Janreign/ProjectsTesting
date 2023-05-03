package ph.kodego.aragon.janreign.projectstesting

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapater (fragmentManager: FragmentManager, lifecycle: Lifecycle ) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    var fragementList: ArrayList<Fragment>  = ArrayList()

    public fun addFragement(fragment: Fragment){
        fragementList.add(fragment)
    }

    override fun getItemCount(): Int {
        return fragementList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragementList.get(position)
    }
}
