package com.example.project3

import android.content.ClipData.Item
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.layout.rememberLazyNearestItemsRangeState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.modifier.ModifierLocalProvider
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp as dp
@Preview(heightDp = 1000)
@Composable
fun PreviewItem(){

    // using the lazy colum for the scrolling behaviour
    LazyColumn(content ={
        items(GetCategoryList()){item ->
            BlogCategory(Img = item.img, title = item.title, subtitle = item.subtitle)

        }
    })
}
@Composable
fun BlogCategory(Img: Int, title:String, subtitle:String){
    Card(
        modifier = Modifier.padding(8.dp)) {
        Row (verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(8.dp)){

            Image(painter = painterResource(id =Img),
                contentDescription =" ",
                modifier = Modifier
                    .size(200.dp)
                    .padding(20.dp)
                    .clip(CircleShape)
                    .size(20.dp)
                    .weight(.2f)



              )
           ItemDescription(title , subtitle , Modifier.weight(.8f) )
        }
    }
}
// reusabe composable function
@Composable
public fun ItemDescription(title: String, subtitle: String, modifier:Modifier) {
    Column(modifier =modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge


        )


        Text(
            text = subtitle,
            fontWeight = FontWeight.ExtraBold
        )
    }
}

/*
A data class in Kotlin is a class that is specifically designed to hold data,
typically with properties that represent the state of an object. It is often used
to model immutable data structures, and it provides several convenient features
 out of the box, such as automatically generating equals(), hashCode(), toString(),
  and copy() methods based on the defined properties.
 */

data class  Category (val img: Int, val title: String, val subtitle: String)

fun GetCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.profile_picture, "Programming", "Learn Programming"))
    list.add(Category(R.drawable.baseline_girl_24, "technology", "News about the Nepal"))
        list.add(Category(R.drawable.baseline_group_add_24, "Full stack Development", "Frorm backend to frontend"))
    list.add(Category(R.drawable.ic_launcher_background, "DevOOPs", "Working the system engineer"))
    list.add(Category(R.drawable.profile_picture, "Programming", "Learn Programming"))
    list.add(Category(R.drawable.baseline_girl_24, "technology", "News about the Nepal"))
    list.add(Category(R.drawable.baseline_group_add_24, "Full stack Development", "Frorm backend to frontend"))
    list.add(Category(R.drawable.ic_launcher_background, "DevOOPs", "Working the system engineer"))
    list.add(Category(R.drawable.profile_picture, "Programming", "Learn Programming"))
    list.add(Category(R.drawable.baseline_girl_24, "technology", "News about the Nepal"))
    list.add(Category(R.drawable.baseline_group_add_24, "Full stack Development", "Frorm backend to frontend"))
    list.add(Category(R.drawable.ic_launcher_background, "DevOOPs", "Working the system engineer"))
    list.add(Category(R.drawable.profile_picture, "Programming", "Learn Programming"))
    list.add(Category(R.drawable.baseline_girl_24, "technology", "News about the Nepal"))
    list.add(Category(R.drawable.baseline_group_add_24, "Full stack Development", "Frorm backend to frontend"))
    list.add(Category(R.drawable.ic_launcher_background, "DevOOPs", "Working the system engineer"))
    return list 
}   

