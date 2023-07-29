package com.example.listviewwithadapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapp.MainActivity;
import com.example.myapp.R;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<String> {

    TextView textView1, textView2;
    Button butn, remove;
    GridView grid;
    String data, result;
    ArrayList<String> List = new ArrayList<String>();
    Context _context;

    LinearLayout parentLayout;


    public MyAdapter(Context context, int textViewResourceId, ArrayList<String> objects) {
        super(context, textViewResourceId, objects);
        List = objects;
        _context = context;
    }

    // Returns total number of items to be displayed in the list.
    // It counts the value from the arraylist size
    @Override
    public int getCount() {
        return super.getCount();
    }

    // This function implicitly gets called when the listItem view is ready
    // to be displayed. Here we set the layout and add data to the views
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View view = convertView;

        // Setting layout
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.list_item, null);
        // textView1 = (TextView) view.findViewById(R.id.androidVersionName);
//      butn = (Button) view.findViewById(R.id.btn);
//      remove = (Button) view.findViewById(R.id.erase);
        textView1 = (TextView) view.findViewById(R.id.androidVersionName);
        parentLayout = (LinearLayout) view.findViewById(R.id.layout_parent);
        grid = (GridView) view.findViewById(R.id.Grid);
        parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //alertdialog();
                // Toast.makeText(_context, "position is"+position, Toast.LENGTH_SHORT).show();
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(_context);
                alertDialog.setTitle("Input");
                alertDialog.setMessage("enter here");
                alertDialog.setCancelable(false);
                final EditText input = new EditText(_context);
                input.setText(MainActivity.alist.get(position).toString());
                input.setInputType(InputType.TYPE_CLASS_TEXT);
                alertDialog.setView(input);
                alertDialog.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        data = input.getText().toString();

                        MainActivity.alist.set(position, data);
                        notifyDataSetChanged();
                        Toast.makeText(_context, "Entered: " + input.getText().toString() + " on position " + position, Toast.LENGTH_LONG).show();
                        //finish();

                    }


                });
                alertDialog.setNegativeButton("Leave", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                alertDialog.create().show();
            }


        });
        parentLayout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                //alertdialog();
                // Toast.makeText(_context, "position is"+position, Toast.LENGTH_SHORT).show();
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(_context);
                alertDialog.setTitle("Do you really want to remove!!");
                alertDialog.setCancelable(false);
//                final EditText input = new EditText(_context);
//                input.setInputType(InputType.TYPE_CLASS_TEXT);
//                alertDialog.setView(input);
                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.alist.remove(position);
                        notifyDataSetChanged();
                        Toast.makeText(_context, "Removed : " + " on position " + position, Toast.LENGTH_LONG).show();
                        //finish();

                    }


                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                alertDialog.show();



                return true;
            }
        });


//        butn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//        });
//        remove.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//        });

//         Adding data to the Views
        textView1.setText(MainActivity.alist.get(position).toString());
        // textView1.setText(androidVersionList.get(position).getAndroidVersionName());
        return view;
    }


//    public void alertdialog() {
//        AlertDialog.Builder alertDialog = new AlertDialog.Builder(_context);
//        alertDialog.setTitle("Input");
//        alertDialog.setMessage("enter here");
//        alertDialog.setCancelable(false);
//        final EditText input = new EditText(_context);
//        input.setInputType(InputType.TYPE_CLASS_TEXT);
//        alertDialog.setView(input);
//        alertDialog.setPositiveButton("Save", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                data = input.getText().toString();
//                androidVersionList.setAndroidVersionName(data);
//              //  textView1.setText(data);
//                Toast.makeText(_context, "Entered: "+ input.getText().toString(), Toast.LENGTH_LONG).show();
//                //finish();
//
//            }
//
//
//        });
//        alertDialog.setNegativeButton("Leave", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                //finish();
//            }
//        });

//        alertDialog.show();
//
//    }


}



