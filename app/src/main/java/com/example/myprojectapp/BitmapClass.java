package com.example.myprojectapp;

public class BitmapClass {
//    public  static String insertImage(ContentResolver contentResolver, Bitmap sourec , String title,String description) throws IOException{
//        ContentValues values = new ContentValues();
//        values.put(MediaStore.Images.Media.TITLE,title);
//        values.put(MediaStore.Images.Media.DISPLAY_NAME,title);
//        values.put(MediaStore.Images.Media.DESCRIPTION,description);
//        values.put(MediaStore.Images.Media.MIME_TYPE,"image/*");
//        values.put(MediaStore.Images.Media.DATE_ADDED,System.currentTimeMillis());
//        values.put(MediaStore.Images.Media.DATE_TAKEN,System.currentTimeMillis());
//
//        Uri uri = null;
//        String stringUrl = null;
//        try {
//            uri = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,values);
//            if(sourec != null){
//                OutputStream outputStream = contentResolver.openOutputStream(uri);
//                sourec.compress(Bitmap.CompressFormat.JPEG,50,outputStream);
//
//                long id = ContentUris.parseId(uri);
//                Bitmap mini = MediaStore.Images.Thumbnails.getThumbnail(contentResolver,id,MediaStore.Images.Thumbnails.MINI_KIND,)
//            }
//        }
//
//    }
}
