package com.example.sanket.ufcourses;

import android.content.Intent;
import android.support.v4.app.ShareCompat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CourseInfoActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Intent intentThatStartedThisActivity = getIntent();

        if (intentThatStartedThisActivity != null) {

            Bundle extras = intentThatStartedThisActivity.getExtras();

            if (extras != null){

                String department = extras.getString("department");
                String program = extras.getString("program");
                String sem = extras.getString("sem");

                HashMap<String, List<String>> matched_courses =
                        (HashMap<String, List<String>>) extras.getSerializable("MatchedCourses");


                setContentView(R.layout.course_schedule);
                setContentViewOfChild(matched_courses);


                /*if (department.equals("Computer Science") && program.equals("Graduate")){

                    if (matched_courses != null && !matched_courses.isEmpty()){

                        if (sem.equals("Spring") || sem.equals("Fall")){

                            setContentView(R.layout.course_schedule);
                            setContentViewOfChild(matched_courses);

                            //LinearLayout  linearlayout = new LinearLayout(this);
                            //fillLayout(linearlayout, matched_courses);// Show List
                            //setContentView(linearlayout);
                        }
                    }

                    else if (sem.equals("Spring")){

                        setContentView(R.layout.course_schedule);
                        setContentViewOfChild(sem);
                        //setContentView(R.layout.spring_schedule);
                    }
                    else if (sem.equals("Fall")){

                        setContentView(R.layout.course_schedule);
                        setContentViewOfChild(sem);
                    }
                }*/
            }
        }
    }


    private void setContentViewOfChild(HashMap<String, List<String>> courses){

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail =  courses;
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new CustomExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
    }

    /*private Intent createShareCourseInfoIntent() {
        Intent shareIntent = ShareCompat.IntentBuilder.from(this)
                .setType("text/plain")
                .setText("To be implemented ")
                .getIntent();
        return shareIntent;
    }*/

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.info, menu);
        MenuItem menuItem = menu.findItem(R.id.action_share);
        menuItem.setIntent(createShareCourseInfoIntent());
        return true;
    }*/

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Intent startSettingsActivity = new Intent(this, CourseInfoActivity.class);
            startActivity(startSettingsActivity);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
