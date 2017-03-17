package com.example.mlebeau.td1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.constraint.solver.ArrayLinkedVariables;

import java.util.ArrayList;

/**
 * Created by mlebeau on 17/03/2017.
 */

public class BDD extends SQLiteOpenHelper {

    private static BDD base = null;

    private BDD(Context context){
        super(context, "BaseSIO",null,1);
    }

    public static BDD getBase(Context context){
        if(base == null){
            base = new BDD(context);
        }
        return base;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE BaseSIO (" +
        "id integer primary key autoincrement " +
        ", nomEtudiant text " +
        ", prenomEtudiant text " +
        ", societe text" +
        ", adresse text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table BaseSIO");
        onCreate(db);
    }

    public long ajouterObjet (Student o)
    {
        ContentValues cv = new ContentValues();
        cv.put("nomEtudiant", o.getNom());
        cv.put("prenomEtudiant", o.getPrenom());
        long res = this.getWritableDatabase().insert("BaseSIO",null,cv);
        o.setId(res);
        this.getWritableDatabase().close();
        return res;
    }

    public ArrayList<Student> getLesObjets(){
        ArrayList<Student> lesObjets = new ArrayList<>();
        Cursor c = this.getReadableDatabase().query("BaseSIO", null, null, null, null, null, null);
        while (c.moveToNext()) {
            Student o = new Student(
                    c.getString(c.getColumnIndex("nomEtudiant")),
                    c.getString(c.getColumnIndex("prenomEtudiant")),
                    c.getString(c.getColumnIndex("societe")),
                    c.getString(c.getColumnIndex("adresse")));
            o.setId(c.getLong(c.getColumnIndex("id")));
            lesObjets.add(o);
        }
        this.getReadableDatabase().close();
        return lesObjets;

        }

        public void mapObjet(Student o){
            ContentValues cv =  new ContentValues();
            cv.put("nomEtudiant",o.getNom());
            cv.put("prenomEtudiant",o.getPrenom());
            this.getWritableDatabase().update("BaseSIO",cv,"id=?", new String[]{String.valueOf(o.getId())});
            this.getWritableDatabase().close();
        }

        public void supprimerObjet(Student aSupp){
            this.getWritableDatabase().delete("BaseSIO", "id=?", new String[]{String.valueOf(aSupp.getId())});
            this.getWritableDatabase().close();

        }


}


