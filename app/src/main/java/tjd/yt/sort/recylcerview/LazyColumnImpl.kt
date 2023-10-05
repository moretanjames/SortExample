package tjd.yt.sort.recylcerview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnImpl(modifier: Modifier = Modifier) {
  LazyColumn(modifier = modifier) {
    items(people) {
      PersonImpl(it)
    }
  }
}

@Composable
fun PersonImpl(person: Person) {
  Surface {
    Row(modifier = Modifier.padding(16.dp)) {
      Column(modifier = Modifier.weight(1f)) {
        Text(text = person.name)
        Text(text = person.birthDayString)
      }

      Box(
        modifier = Modifier
          .size(24.dp)
          .background(person.faveColor, shape = RoundedCornerShape(4.dp))
      )
    }
  }
}