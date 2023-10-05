@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package tjd.yt.sort

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import tjd.yt.sort.recylcerview.LazyColumnImpl
import tjd.yt.sort.recylcerview.RecyclerViewImpl
import tjd.yt.sort.ui.theme.SortExampleTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      SortExampleTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

        }
      }
    }
  }
}

@Composable
fun DiamondButton(
  icon: Painter,
  onClick: () -> Unit
) {
  Box(
    modifier = Modifier
      .shadow(elevation = 2.dp, shape = DiamondShape)
      .clip(DiamondShape)
      .clickable { onClick() }
      .background(brush = Brush.horizontalGradient(listOf(Color.Magenta, Color.Red)), shape = DiamondShape)
      .padding(12.dp),
    contentAlignment = Alignment.Center
  ) {
    Icon(painter = icon, contentDescription = null, tint = Color.White)
  }
}

object DiamondShape : Shape {
  override fun createOutline(size: Size, layoutDirection: LayoutDirection, density: Density): Outline {

    val path = Path().apply {
      moveTo(size.width / 2, 0f) // Top Point
      lineTo(size.width, size.height / 2) // Right Point
      lineTo(size.width / 2, size.height) // Bottom Point
      lineTo(0f, size.height / 2) // Left Point
      lineTo(size.width / 2, 0f) // Top Point
    }

    return Outline.Generic(path)
  }
}

@Composable
fun ModifiedBox() {
  Box(
    modifier = Modifier
      .background(Color.Red)
      .padding(16.dp)
      .offset(x = 25.dp, y = 25.dp)
      .size(100.dp)
      .background(Color.Blue)
  )
}


@Preview
@Composable
fun Preview() {
  SortExampleTheme(darkTheme = true) {
    Surface {
      Box(
        modifier = Modifier.size(200.dp),
        contentAlignment = Alignment.Center
      ) {
        Box(
          modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
        ) {
          ModifiedBox()
        }
      }
    }
  }
}

@Preview
@Composable
fun DiamondPreview() {
  SortExampleTheme(darkTheme = true) {
    Surface {
      Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
      ) {
        Row(verticalAlignment = Alignment.CenterVertically) {

          OutlinedTextField(
            value = "",
            onValueChange = {},
            trailingIcon = { Icon(imageVector = Icons.Outlined.Search, contentDescription = null) }
          )

          Spacer(modifier = Modifier.width(16.dp))

          DiamondButton(
            icon = rememberVectorPainter(Icons.Outlined.AccountCircle),
            onClick = {}
          )
        }
      }
    }
  }
}

@Preview
@Composable
fun RecyclerPreview() {
  SortExampleTheme {
    Surface {
      RecyclerViewImpl(modifier = Modifier.fillMaxSize())
    }
  }
}

@Preview
@Composable
fun LazyColumnPreview() {
  SortExampleTheme {
    Surface {
      LazyColumnImpl(modifier = Modifier.fillMaxSize())
    }
  }
}