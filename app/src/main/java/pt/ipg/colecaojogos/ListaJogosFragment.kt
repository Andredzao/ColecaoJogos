package pt.ipg.colecaojogos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import pt.ipg.colecaojogos.databinding.FragmentListaJogosBinding

/*
 * A simple [Fragment] subclass.
 * Use the [ListaJogosFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListaJogosFragment : Fragment() {
    private var _binding: FragmentListaJogosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_jogos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapterJogos = AdapterJogos()
        binding.recyclerViewJogos.adapter = adapterJogos
        binding.recyclerViewJogos.layoutManager = LinearLayoutManager(requireContext())
    }

    companion object {

    }
}