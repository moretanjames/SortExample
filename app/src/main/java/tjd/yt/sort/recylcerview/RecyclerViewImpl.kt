package tjd.yt.sort.recylcerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.viewinterop.AndroidView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import tjd.yt.sort.R


@Composable
fun RecyclerViewImpl(modifier: Modifier = Modifier) {
  AndroidView(
    factory = { context ->
      RecyclerView(context).apply {
        layoutManager = LinearLayoutManager(context)
        adapter = PersonAdapter(people)
      }
    },
    modifier = modifier
  )
}


class PersonAdapter(private val people: List<Person>) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

  // create new views
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
    return PersonViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.person_layout, parent, false))
  }

  override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
    val person = people[position]
    holder.name.text = person.name
    holder.bDay.text = person.birthDayString
    holder.color.setBackgroundColor(person.faveColor.toArgb())
  }

  // return the number of the items in the list
  override fun getItemCount() = people.size

  // Holds the views for adding it to image and text
  class PersonViewHolder(personView: View) : RecyclerView.ViewHolder(personView) {
    val name: TextView = personView.findViewById(R.id.person_name)
    val bDay: TextView = personView.findViewById(R.id.person_bday)
    val color: View = personView.findViewById(R.id.color_view)
  }
}