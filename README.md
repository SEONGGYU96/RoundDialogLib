# RoundDialogLib

[![](https://jitpack.io/v/SEONGGYU96/RoundDialogLib.svg)](https://jitpack.io/#SEONGGYU96/RoundDialogLib)  

## Preview


<img width="300" src="https://user-images.githubusercontent.com/57310034/101352645-d2c13900-38d5-11eb-9c4d-5bf638be8117.gif"/> <img width="300" src="https://user-images.githubusercontent.com/57310034/101352778-fd12f680-38d5-11eb-9a17-52387dec52ba.gif"/>  


## Describe


It is a dialog which has round edge with simple design.  
So it goes well with almost Android applications.  
If you need simple dialog but not default theme, You can use it!  
It provide a lot of attributes to custom dialog.  
Try it!  

## Usage

Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
    repositories {
        ...
	maven { url 'https://jitpack.io' }
    }
}
```
<br>

Add the dependency:
```gradle
dependencies {
    implementation 'com.github.SEONGGYU96:RoundDialogLib:1.1.0'
}
```
<br>

You can make the dialog using `RoundDialogBuilder`
```kotlin
RoundDialogBuilder()
    .setTitle("Normal")
    .setContentText("This is normal Dialog")
    .addVerticalButton("OK") {
        Toast.makeText(application, "You said OK!", Toast.LENGTH_SHORT).show()
    }
    .addVerticalButton("Cancel")
    .build()
    .show(supportFragmentManager, "normal")
```

## Attributes
 
1. `setTitle()` - Set title of RoundDialog.
2. `setContentView()` - Add a content using layout.
3. `setContentText()` - Add a content as a text.
4. `addHorizontalButton()` - Add a horizontal button.
5. `addVerticalButton()` - Add a vertical button.
6. `setTextSize()` - Change whole of text size of dialog.
7. `setDividerColor()` - Change divider color.
8. `enableDivider()` - set divider enabled or disabled.
9. `enableCancel()` - enable or disable to close the dialog by touching the outside of it.

## Sample
 
<img width="300" src="https://user-images.githubusercontent.com/57310034/101354517-a4912880-38d8-11eb-9e80-fb40f216901e.png"/>

```kotlin
RoundDialogBuilder()
    .setTitle("Normal")
    .setContentText("This is normal Dialog")
    .addVerticalButton("OK") {
        Toast.makeText(application, "You said OK!", Toast.LENGTH_SHORT).show()
    }
    .addVerticalButton("Cancel")
    .build()
    .show(supportFragmentManager, "normal")
```  
<br>

<img width="300" src="https://user-images.githubusercontent.com/57310034/101354653-d5715d80-38d8-11eb-9166-95fbcee10064.png"/>

```kotlin
RoundDialogBuilder()
    .addVerticalButton("First choice")
    .addVerticalButton("Second choice")
    .build()
    .show(supportFragmentManager, "only_button")
```  
<br>

<img width="300" src="https://user-images.githubusercontent.com/57310034/101354739-f639b300-38d8-11eb-88ac-8e8a19194aae.png"/>

```kotlin
RoundDialogBuilder()
    .setContentText("Are you sure?", true)
    .addHorizontalButton("Yes")
    .addHorizontalButton("No")
    .setTextSize(20f)
    .build()
    .show(supportFragmentManager, "yes_no")
```  
<br>

<img width="300" src="https://user-images.githubusercontent.com/57310034/101354834-1d908000-38d9-11eb-9059-3c8b3ec000c0.png"/>

```kotlin
RoundDialogBuilder()
    .setTitle("Custom content!")
    .setContentView(R.layout.layout_edittext)
    .addHorizontalButton("Done") {
        Toast.makeText(application, "Your name is " + it?.findViewById<EditText>(R.id.editText)?.text,
                        Toast.LENGTH_SHORT).show()
    }
    .addHorizontalButton("Nope")
    .build()
    .show(supportFragmentManager, "edittext")
```  
<br>

<img width="300" src="https://user-images.githubusercontent.com/57310034/101354923-3b5de500-38d9-11eb-8c69-0d59c79b18ca.png"/>

```kotlin
RoundDialogBuilder()
    .setTitle("Colorful")
    .setContentText("You can apply pointColor\nwith color drawable id", true)
    .setPointColor(R.color.teal_200)
    .addHorizontalButton("Nice")
    .addHorizontalButton("Not bad")
    .enableDivider(false)
    .build()
    .show(supportFragmentManager, "colorful")
```  
<br>

<img width="300" src="https://user-images.githubusercontent.com/57310034/101355042-621c1b80-38d9-11eb-9d3e-06c9a9a21c2b.png"/>

```kotlin
RoundDialogBuilder()
    .setTitle("Try !")
    .setContentText("Where will you go?\nYou must choice.")
    .addHorizontalButton("Left")
    .addHorizontalButton("Top")
    .addHorizontalButton("Right")
    .enableCancel(false)
    .build()
    .show(supportFragmentManager, "more_button")
```  
<br>

<img width="300" src="https://user-images.githubusercontent.com/57310034/101355117-795b0900-38d9-11eb-8e76-b192ddc6497f.png"/>

```kotlin
RoundDialogBuilder()
    .setTitle("Favorite color")
    .addVerticalButton("Red")
    .addVerticalButton("Blue")
    .addVerticalButton("Yellow")
    .addVerticalButton("Green")
    .addVerticalButton("Black")
    .build()
    .show(supportFragmentManager, "more_more")
```  
<br>

Even you can make like it.

<img width="300" src="https://user-images.githubusercontent.com/57310034/101355234-a3143000-38d9-11eb-90a2-bf40f4fe1fc5.png"/>

```kotlin
RoundDialogBuilder()
    .setTitle("Hm,,")
    .setContentText("It's just..for fun")
    .addVerticalButton("Trust me")
    .addVerticalButton("Nobody")
    .addVerticalButton("Use it")
    .addHorizontalButton("It's")
    .addHorizontalButton("Wired")
    .addHorizontalButton("~.~")
    .build()
    .show(supportFragmentManager, "wired")
```  
<br>
Designed by Lee Yeong Jin

## License
Copyright (c) 2020 KIM SEONG GYU 
<br>

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at  

[http://www.apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)  

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.  
