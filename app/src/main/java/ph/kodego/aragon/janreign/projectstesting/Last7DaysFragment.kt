package ph.kodego.aragon.janreign.projectstesting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ph.kodego.aragon.janreign.projectstesting.databinding.FragmentLast7DaysBinding
import ph.kodego.aragon.janreign.projectstesting.databinding.FragmentTodayBinding

class Last7DaysFragment : Fragment() {
    private var _binding: FragmentLast7DaysBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLast7DaysBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()

    }
}