# RateUs Android sdk
This is an example of how to implement rating dialog in your app.

## Introduction
RateUs is an android sdk to show the rating dialog in your app with the leverage of customization of it's layout design. You can easily make it suitable for your application with lot of user defined attributes.

## Preview
![rate](https://user-images.githubusercontent.com/30499733/51603504-ff614700-1f2f-11e9-9a3e-e32609e0085e.png)

## Implementation
### write this line of code in your gradle (App level)
implementation 'com.github.ashujhaji:ratemyapp:1.0.0'
### Put this code in your parent activity or wherever you want to show
RatingDialog.getInstance()<br/>
                .setPeriodicCount(3)<br/>
                .setBackgroundColor(R.color.white)<br/>
                .setIcon(R.drawable.star)<br/>
                .setCancelTextColor(R.color.grey500)<br/>
                .setMessageTextColor(R.color.colorAccent)<br/>
                .setCancelTextBackground(R.color.white)<br/>
                .setMessageText("Loved Rating App? Please rate us")<br/>
                .initDialog(MainActivity.this, MainActivity.this)<br/>
                .showDialog();
