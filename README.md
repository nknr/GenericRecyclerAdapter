## GenericRecyclerAdapter [![GitHub stars](https://img.shields.io/github/stars/nknr/GenericRecyclerAdapter?style=social)](https://github.com/login?return_to=%2FTheAlphamerc%flutter-GitConnect) ![GitHub forks](https://img.shields.io/github/forks/nknr/GenericRecyclerAdapter?style=social)

![GitHub pull requests](https://img.shields.io/github/issues-pr/nknr/GenericRecyclerAdapter) ![GitHub closed pull requests](https://img.shields.io/github/issues-pr-closed/nknr/GenericRecyclerAdapter) ![GitHub last commit](https://img.shields.io/github/last-commit/nknr/GenericRecyclerAdapter)  ![GitHub issues](https://img.shields.io/github/issues-raw/nknr/GenericRecyclerAdapter) [![Open Source Love](https://badges.frapsoft.com/os/v2/open-source.svg?v=103)](https://github.com/nknr/GenericRecyclerAdapter)

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
