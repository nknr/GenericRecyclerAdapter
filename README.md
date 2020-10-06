# GenericRecyclerAdapter

The main purpose of this repo to reduce of creating **RecyclerAdapter** and **ViewHolder** to display data on view with item click
```
BaseAdapter<AndroidVersion> adapter = new BaseAdapter<>(R.layout.item_android_version);
binding.recyclerView.setAdapter(adapter);
```

```
adapter.setActionListener((view,position) ->
                Toast.makeText(this
                        , adapter.getItemAtPosition(position).getName()
                        , Toast.LENGTH_SHORT).show());
```


remove **NullPointerException** when do not use of listener
```
android:onClick="@{(view)->actionListener != null? actionListener.onItemClicked(view,position):void}"
```

![Screen](../master/screenshot/image.png)


## Reference 
https://proandroiddev.com/using-a-generic-recyclerview-adapter-for-all-the-lists-in-your-android-application-6724501a9d
