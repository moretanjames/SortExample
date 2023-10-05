package tjd.yt.sort.recylcerview

import androidx.compose.ui.graphics.Color


data class Person(
  val name: String,
  val birthDayString: String,
  val faveColor: Color
)


val people = listOf(
  Person(
    name = "Tanner Harding",
    birthDayString = "May 24th 1997",
    faveColor = Color.Magenta
  ),
  Person(
    name = "Taz Harding",
    birthDayString = "Feb 28th 1995",
    faveColor = Color.Blue
  ),
  Person(
    name = "Mattilyn Harding",
    birthDayString = "March 4th 1997",
    faveColor = Color.Green
  ),
  Person(
    name = "Mason Harding",
    birthDayString = "May 3rd 1997",
    faveColor = Color.LightGray
  ),
  Person(
    name = "Connor Harding",
    birthDayString = "March 1st 1992",
    faveColor = Color.DarkGray
  ),
  Person(
    name = "Santa Claus",
    birthDayString = "Jan 1st 0000",
    faveColor = Color.Red
  ),
  Person(
    name = "Someone Harding",
    birthDayString = "May 3rd 1997",
    faveColor = Color.Cyan
  ),
  Person(
    name = "Noone Harding",
    birthDayString = "May 3rd 1997",
    faveColor = Color.Yellow
  ),
  Person(
    name = "Justa Harding",
    birthDayString = "May 3rd 1997",
    faveColor = Color.Magenta
  ),
  Person(
    name = "Who is Harding",
    birthDayString = "May 3rd 1997",
    faveColor = Color.Blue
  ),
  Person(
    name = "Fake Name Harding",
    birthDayString = "May 3rd 1997",
    faveColor = Color.Black
  ),
  Person(
    name = "Real Name Harding",
    birthDayString = "May 3rd 1997",
    faveColor = Color.Magenta
  ),
  Person(
    name = "Nope Harding",
    birthDayString = "May 3rd 1997",
    faveColor = Color.Yellow
  ),
  Person(
    name = "Yep Harding",
    birthDayString = "May 3rd 1997",
    faveColor = Color.DarkGray
  ),
  Person(
    name = "What Harding",
    birthDayString = "May 3rd 1997",
    faveColor = Color.Red
  ),
)