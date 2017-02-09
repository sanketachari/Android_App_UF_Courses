package com.example.sanket.ufcourses;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends AppCompatActivity{

    Spinner spinner1, spinner2, spinner3;
    CustomOnItemSelectedListener spinnerListener1, spinnerListener2, spinnerListener3;

    public static HashMap<String, List<String>> FallCourses(){

        HashMap<String, List<String>> fall_courses = new HashMap<>();


        List<String> CAP5416 = new ArrayList<String>();
        CAP5416.add("Instructor: Vemuri,Baba C");
        CAP5416.add("Schedule: M, W, F | 10:40 am - 11:30 am");

        List<String> CAP5510 = new ArrayList<String>();
        CAP5510.add("Instructor: Kahveci,Tamer");
        CAP5510.add("Schedule: M, W, F | 3:00 pm - 3:50 pm");

        List<String> CAP5705 = new ArrayList<String>();
        CAP5705.add("Instructor: Peters,Jorg");
        CAP5705.add("Schedule: M, W, F | 3:00 pm - 3:50 pm");

        List<String> CAP5771 = new ArrayList<String>();
        CAP5771.add("Instructor: Wang, Zhe");
        CAP5771.add( "Schedule:  M, W, F | 3:00 pm - 3:50 pm");

        List<String> CAP6617 = new ArrayList<String>();
        CAP6617.add("Instructor: Rangarajan,Anand");
        CAP6617.add("Schedule: M, W, F | 11.45 am - 12:35 pm");

        List<String> CDA5155 = new ArrayList<String>();
        CDA5155.add("Instructor: Peir,Jihkwon");
        CDA5155.add("Schedule: T 9:35 am - 11:30 am  \n\t\t\t\t\t\t\t\t \t R 10:40 am - 11:30 am");


        List<String> CEN5035 = new ArrayList<String>();
        CEN5035.add("Instructor: Thebaut,Stephen Ma");
        CEN5035.add( "Schedule:  T 1:55 pm - 2:45 pm  \n\t\t\t\t\t\t\t\t \t R 1:55 pm - 3:50 pm");

        List<String> CEN5728 = new ArrayList<String>();
        CEN5728.add("Instructor: Anthony,Lisa");
        CEN5728.add( "Schedule:  T 1:55 pm - 2:45 pm  \n\t\t\t\t\t\t\t\t\t\t R 1:55 pm - 3:50 pm");

        List<String> CEN6075 = new ArrayList<String>();
        CEN6075.add("Instructor: Thebaut,Stephen M");
        CEN6075.add("Schedule: T 1:55 pm - 2:45 pm  \n\t\t\t\t\t\t\t\t \t R 1:55 pm - 3:50 pm");

        List<String> CIS6905 = new ArrayList<String>();
        CIS6905.add("Instructor: Helmy,Ahmed Abdelghaffar");
        CIS6905.add("Schedule: ");

        List<String> SUPRES = new ArrayList<String>();
        SUPRES.add("Instructor: Helmy,Ahmed Abdelghaffar");
        SUPRES.add("Schedule: ");


        List<String> ADB = new ArrayList<String>();
        ADB.add("Instructor: Schneider,Markus Paul");
        ADB.add("Schedule: M, W, F | 12:50 pm - 1:40 pm");

        List<String> CSEDU = new ArrayList<String>();
        CSEDU.add("Instructor: Gardner-McCune,Christin");
        CSEDU.add("Schedule: T 3:00 pm - 4:55 pm  \n\t\t\t\t\t\t\t\t \t R 4:05 pm - 4:55 pm");


        List<String> NLP = new ArrayList<String>();
        NLP.add("Instructor: Boyer,Kristy");
        NLP.add( "Schedule:  M, W, F | 8:30 am - 9:20 am");

        List<String> DATAINT = new ArrayList<String>();
        DATAINT.add("Instructor: Ranka,Sanjay");
        DATAINT.add("Schedule: ");

        List<String> IOT = new ArrayList<String>();
        IOT.add("Instructor: Thai,My Tra");
        IOT.add("Schedule: T 1:55 pm - 2:45 pm  \n\t\t\t\t\t\t\t\t \t R 1:55 pm - 3:50 pm");


        List<String> INTTRAFFIC = new ArrayList<String>();
        INTTRAFFIC.add("Instructor: Chen,Shigang");
        INTTRAFFIC.add("Schedule: T 8:30 am - 10:25 am  \n\t\t\t\t\t\t\t\t \t R 9:35 am - 10:25 am");


        List<String> PENTEST = new ArrayList<String>();
        PENTEST.add("Instructor: Wilson,Joseph N");
        PENTEST.add("Schedule: M, W, F | 9:35 am - 10:25 am");

        List<String> SPARSE = new ArrayList<String>();
        SPARSE.add("Instructor: Entezari,Alireza");
        SPARSE.add("Schedule: M, W, F | 10:40 am - 11:30 am");

        List<String> SUPTEACH = new ArrayList<String>();
        SUPTEACH.add("Instructor: Anthony,Lisa");
        SUPTEACH.add("Schedule: ");


        List<String> CCOMP = new ArrayList<String>();
        CCOMP.add("Instructor: Xia, Ye");
        CCOMP.add( "Schedule: T 1:55 pm - 2:45 pm  \n\t\t\t\t\t\t\t\t \t R 1:55 pm - 3:50 pm");


        List<String> CIS6935 = new ArrayList<String>();
        CIS6935.add("Instructor: Gilbert,Juan Eugen");
        CIS6935.add("Schedule: T 3:00 pm - 4:55 pm  \n\t\t\t\t\t\t\t\t \t R 4:05 pm - 4:55 pm");

        List<String> CIS6971 = new ArrayList<String>();
        CIS6971.add("Instructor: Helmy,Ahmed Abdelghaffar");
        CIS6971.add("Schedule: ");

        List<String> CIS7979 = new ArrayList<String>();
        CIS7979.add("Instructor: Helmy,Ahmed Abdelghaffar");
        CIS7979.add( "Schedule:  ");

        List<String> CIS7980 = new ArrayList<String>();
        CIS7980.add("Instructor: Helmy,Ahmed Abdelghaffar");
        CIS7980.add("Schedule: ");

        List<String> CNT5106C = new ArrayList<String>();
        CNT5106C.add("Instructor: Chen, Shigang");
        CNT5106C.add("Schedule: T 1:55 pm - 3:50 pm  \n\t\t\t\t\t\t\t\t \t R 1:55 pm - 2:45 pm");

        List<String> CNT5410 = new ArrayList<String>();
        CNT5410.add("Instructor: Traynor,Patrick");
        CNT5410.add("Schedule:  M, W, F | 12:50 am - 1:40 pm");


        List<String> CNT6885 = new ArrayList<String>();
        CNT6885.add("Instructor: Liu,Chien-Liang");
        CNT6885.add( "Schedule:  M, W, F | 12:50 am - 1:40 pm");


        List<String> COP5536 = new ArrayList<String>();
        COP5536.add("Instructor: Sahni,Sartaj Kumar");
        COP5536.add("Schedule: M, W, F | 12:50 am - 1:40 pm");

        List<String> COP5615 = new ArrayList<String>();
        COP5615.add("Instructor: Helal,Abdelsalam Ali");
        COP5615.add("Schedule: T 10:40 am - 12:20 pm  \n\t\t\t\t\t\t\t\t \t R 10:40 am - 11:30 am");

        List<String> COP5618 = new ArrayList<String>();
        COP5618.add("Instructor: Sanders,Beverly A");
        COP5618.add("Schedule: M, W, F | 1:55 pm - 2:45 pm");

        List<String> COP5625 = new ArrayList<String>();
        COP5625.add("Instructor: Bermudez,Manuel E");
        COP5625.add("Schedule: M, W, F | 3:00 am - 3:50 pm");

        List<String> COT5405 = new ArrayList<String>();
        COT5405.add("Instructor: Ungor, Alper");
        COT5405.add("Schedule: T 10:40 am - 12:20 pm  \n\t\t\t\t\t\t\t\t \t R 10:40 am - 11:30 am");

        List<String> COT5615 = new ArrayList<String>();
        COT5615.add("Instructor: Banerjee,Arunava");
        COT5615.add( "Schedule:  M, W, F | 1:55 pm - 2:45 pm");

        List<String> COT6315 = new ArrayList<String>();
        COT6315.add("Instructor: Sitharam,Meera");
        COT6315.add("Schedule: T 8:30 am - 10:25 am  \n\t\t\t\t\t\t\t\t \t R 9:35 am - 10:25 am");

        List<String> EGN5949 = new ArrayList<String>();
        EGN5949.add("Instructor: Helmy,Ahmed Abdelghaffar");
        EGN5949.add("Schedule: ");


        fall_courses.put("CAP5416 - COMPUTERS & VISION 1", CAP5416);
        fall_courses.put("CAP5510 - BIOINFORMATICS", CAP5510);
        fall_courses.put("CAP5705 - COMPUTER GRAPHICS", CAP5705);
        fall_courses.put("CAP5771 - INTRO TO DATA SCIENCE", CAP5771);
        fall_courses.put("CAP6617 - ADV MACHINE LEARNING", CAP6617);

        fall_courses.put("CDA5155 - COMPU ARCHITECT PRIN", CDA5155);
        fall_courses.put("CEN5035 - SOFTWARE ENGINEERING", CEN5035);
        fall_courses.put("CEN5728 - UX DESIGN", CEN5728);
        fall_courses.put("CEN6075 - SOFTWARE SPECIFICA", CEN6075);
        fall_courses.put("CIS6905 - INDIVIDUAL STUDY", CIS6905);

        fall_courses.put("CIS6930 - SUPERVISED RESEARCH", SUPRES);
        fall_courses.put("CIS6930 - ADVANCED DATABASE", ADB);
        fall_courses.put("CIS6930 - CS EDUCATION RESEARCH", CSEDU);
        fall_courses.put("CIS6930 - DIALG SYS NAT LANG IF", NLP);
        fall_courses.put("CIS6930 - HIPERF DATA INT COMP", DATAINT);

        fall_courses.put("CIS6930 - INTERNET OF THINGS", IOT);
        fall_courses.put("CIS6930 - INTERNET TRAFFIC MEAS", INTTRAFFIC);
        fall_courses.put("CIS6930 - PENETRATION TESTING", PENTEST);
        fall_courses.put("CIS6930 - SPARSE CODING SENSING", SPARSE);
        fall_courses.put("CIS6930 - SUPERVISED TEACHING", SUPTEACH);

        fall_courses.put("CIS6930 - TOPICS CLOUD COMPUTNG", CCOMP);
        fall_courses.put("CIS6935 - GRADUATE SEMINAR", CIS6935);
        fall_courses.put("CIS6971 - MASTERS RESEARCH", CIS6971);
        fall_courses.put("CIS7979 - ADVANCED RESEARCH", CIS7979);
        fall_courses.put("CIS7980 - DOCTORAL RESEARCH STUDY", CIS7980);

        fall_courses.put("CNT5106 - COMPUTER NETWORKS", CNT5106C);
        fall_courses.put("CNT5410 - COMPU & NTWK SECURITY", CNT5410);
        fall_courses.put("CNT6885 - DISTR MULTIMEDIA SYST", CNT6885);
        fall_courses.put("COP5536 - ADV DATA STRUCTURES", COP5536);
        fall_courses.put("COP5615 - DIST OPER SYS PRINC", COP5615);

        fall_courses.put("COP5618 - CONCURRENT PROGRAM", COP5618);
        fall_courses.put("COP5625 - PROGRAM LANG TRANSLA", COP5625);
        fall_courses.put("COT5405 - ANALYSIS OF ALGORITHMS", COT5405);
        fall_courses.put("COT5615 - MATH INTELLIGENT SYS", COT5615);
        fall_courses.put("COT6315 - FORMAL LANG & COMPUTA", COT6315);

        fall_courses.put("EGN5949 - PRAC/INTERN/COOP WORK", EGN5949);

        return fall_courses;
    }


    public static HashMap<String, List<String>> SpringCourses(){

        HashMap<String, List<String>> spring_courses = new HashMap<>();


        List<String> CAP5100 = new ArrayList<String>();
        CAP5100.add("Instructor: Lok, Benjamin");
        CAP5100.add("Schedule: M, W, F | 10.40 - 11.30");

        List<String> CAP5108 = new ArrayList<String>();
        CAP5108.add("Instructor: Jain,Eakta");
        CAP5108.add("Schedule: T 3:00 pm - 4:55 pm  \n\t\t\t\t\t\t\t\t \t R 4:05 pm - 4:55 pm");

        List<String> CAP6137 = new ArrayList<String>();
        CAP6137.add("Instructor: Wilson,Joseph N");
        CAP6137.add( "Schedule:  M, W, F | 12:50 pm - 1:40 pm");

        List<String> CAP6516 = new ArrayList<String>();
        CAP6516.add("Instructor: Vemuri,Baba C");
        CAP6516.add("Schedule: M, W, F | 10.40 am - 11:30 am");

        List<String> CAP6610 = new ArrayList<String>();
        CAP6610.add("Instructor: Banerjee,Arunava");
        CAP6610.add("Schedule: M, W, F | 12:50 pm - 1:40 pm");


        List<String> CAP6701 = new ArrayList<String>();
        CAP6701.add("Instructor: Peters,Jorg");
        CAP6701.add( "Schedule:  M, W, F | 10.40 am - 11:30 am");

        List<String> CDA5636 = new ArrayList<String>();
        CDA5636.add("Instructor: Mishra,Prabhat Kumar");
        CDA5636.add("Schedule: M, W, F | 10.40 am - 11:30 am");

        List<String> CEN5726 = new ArrayList<String>();
        CEN5726.add("Instructor: Ruiz,Jaime");
        CEN5726.add("Schedule: M, W, F | 10.40 am - 11:30 am");


        List<String> CEN6070 = new ArrayList<String>();
        CEN6070.add("Instructor: Thebaut,Stephen M");
        CEN6070.add("Schedule: M, W, F | 1:55 pm - 2:45 pm");

        List<String> CIS5371 = new ArrayList<String>();
        CIS5371.add("Instructor: Shrimpton,Thomas");
        CIS5371.add("Schedule: M, W, F | 11:45 am - 12:35 pm");


        List<String> CIS6905 = new ArrayList<String>();
        CIS6905.add("Instructor: Helmy,Ahmed Abdelghaffar");
        CIS6905.add( "Schedule:  ");

        List<String> AUDIO = new ArrayList<String>();
        AUDIO.add("Instructor: McMullen,Kyla");
        AUDIO.add("Schedule: T 3:00 pm - 4:55 pm  \n\t\t\t\t\t\t\t\t \t R 4:05 pm - 4:55 pm");

        List<String> ADVDATAMINING = new ArrayList<String>();
        ADVDATAMINING.add("Instructor: Ranka,Sanjay");
        ADVDATAMINING.add("Schedule: T 3:00 pm - 4:55 pm  \n\t\t\t\t\t\t\t\t \t R 4:05 pm - 4:55 pm");


        List<String> AFFECTCOMP = new ArrayList<String>();
        AFFECTCOMP.add("Instructor: Daily,Shaundra");
        AFFECTCOMP.add("Schedule: T 8:30 am - 10:25 am  \n\t\t\t\t\t\t\t\t \t R 9:35 am - 10:25 am");


        List<String> BIOALGO = new ArrayList<String>();
        BIOALGO.add("Instructor: Boucher,Christina AM");
        BIOALGO.add("Schedule: T 3:00 pm - 4:55 pm  \n\t\t\t\t\t\t\t\t \t R 4:05 pm - 4:55 pm");

        List<String> DCM = new ArrayList<String>();
        DCM.add("Instructor: Xia, Ye");
        DCM.add("Schedule: M, W, F | 10.40 - 11:30");

        List<String> MOBNET = new ArrayList<String>();
        MOBNET.add("Instructor: Shrimpton,Thomas");
        MOBNET.add("Schedule: M, W, F | 11:45 am - 12:35 pm");


        List<String> PROJDS = new ArrayList<String>();
        PROJDS.add("Instructor: Wang,Zhe");
        PROJDS.add( "Schedule: ");

        List<String> CIS6935 = new ArrayList<String>();
        CIS6935.add("Instructor: McMullen,Kyla");
        CIS6935.add("Schedule: T 3:00 pm - 4:55 pm  \n\t\t\t\t\t\t\t\t \t R 4:05 pm - 4:55 pm");

        List<String> CIS6971 = new ArrayList<String>();
        CIS6971.add("Instructor: Helmy,Ahmed Abdelghaffar");
        CIS6971.add("Schedule: ");

        List<String> CIS7979 = new ArrayList<String>();
        CIS7979.add("Instructor: Helmy,Ahmed Abdelghaffar");
        CIS7979.add( "Schedule:  ");

        List<String> CIS7980 = new ArrayList<String>();
        CIS7980.add("Instructor: McMullen,Kyla");
        CIS7980.add("Schedule: ");

        List<String> CNT5106C = new ArrayList<String>();
        CNT5106C.add("Instructor: Xia, Ye");
        CNT5106C.add("Schedule: M, W, F | 10.40 - 11:30");

        List<String> CNT5517 = new ArrayList<String>();
        CNT5517.add("Instructor: Helal,Abdelsalam Ali");
        CNT5517.add("Schedule: T 1:55 pm - 2:45 pm  \n\t\t\t\t\t\t\t\t \t R 1:55 pm - 3:50 pm");


        List<String> COP5536 = new ArrayList<String>();
        COP5536.add("Instructor: Sahni,Sartaj Kumar");
        COP5536.add("Schedule: M, W, F | 12:50 am - 1:40 pm");

        List<String> COP5556 = new ArrayList<String>();
        COP5556.add("Instructor: Sanders, Beverly");
        COP5556.add( "Schedule:  M, W, F | 10.40 - 11:30");

        List<String> COP5725 = new ArrayList<String>();
        COP5725.add("Instructor: Schneider,Markus Pau");
        COP5725.add("Schedule: T 8:30 am - 9:20 am  \n\t\t\t\t\t\t\t\t \t R 8:30 am - 10:25 am");

        List<String> COT5405 = new ArrayList<String>();
        COT5405.add("Instructor: Ungor, Alper");
        COT5405.add("Schedule: T 10.40 - 12:20  \n\t\t\t\t\t\t\t\t \t R 10.40 - 11:30");

        List<String> EGN5949 = new ArrayList<String>();
        EGN5949.add("Instructor: Helmy,Ahmed Abdelghaffar");
        EGN5949.add("Schedule: ");


        spring_courses.put("CAP5100 - HUMAN COMP INTERACTION", CAP5100);

        spring_courses.put("CAP5108 - RESEARCH MTHD FOR HCC", CAP5108);
        spring_courses.put("CAP6137 - MALWARE REV ENGR", CAP6137);
        spring_courses.put("CAP6516 - MEDICAL IMAGE ANALY", CAP6516);
        spring_courses.put("CAP6610 - MACHINE LEARNING", CAP6610);
        spring_courses.put("CAP6701 - ADV COMPUTER GRAPHICS", CAP6701);

        spring_courses.put("CDA5636 - EMBEDDED SYSTEMS", CDA5636);
        spring_courses.put("CEN5726 - NATURAL USR INTERACTN", CEN5726);
        spring_courses.put("CEN6070 - SOFTWARE TEST/VERIF", CEN6070);
        spring_courses.put("CIS5371 - INTRO TO CRYPTOLOGY", CIS5371);
        spring_courses.put("CIS6905 - INDIVIDUAL STUDY", CIS6905);

        spring_courses.put("CIS6930 - 3D AUDIO", AUDIO);
        spring_courses.put("CIS6930 - ADV TOPIC DATA MINING", ADVDATAMINING);
        spring_courses.put("CIS6930 - AFFECTIVE COMPUTING", AFFECTCOMP);
        spring_courses.put("CIS6930 - BIOINFORM ALGORITHMSY", BIOALGO);
        spring_courses.put("CIS6930 - DATACENTER MGMT", DCM);
        spring_courses.put("CIS6930 - MOBILE NETWORKING", MOBNET);
        spring_courses.put("CIS6930 - PROJECTS DATA SCIENCE", PROJDS);

        spring_courses.put("CIS6935 - GRADUATE SEMINAR", CIS6935);
        spring_courses.put("CIS6971 - MASTERS RESEARCH", CIS6971);
        spring_courses.put("CIS7979 - ADVANCED RESEARCH", CIS7979);
        spring_courses.put("CIS7980 - DOCTORAL RESEARCH STUDY", CIS7980);
        spring_courses.put("CNT5106 - COMPUTER NETWORKS", CNT5106C);
        spring_courses.put("CNT5517 - MOBILE COMPUTING", CNT5517);

        spring_courses.put("COP5536 - ADV DATA STRUCTURES", COP5536);
        spring_courses.put("COP5556 - PROGRAM LANG PRINCIPLES", COP5556);
        spring_courses.put("COP5725 - DATA BASE MANAGE SYS", COP5725);
        spring_courses.put("COT5405 - ANALYSIS OF ALGORITHMS", COT5405);
        spring_courses.put("EGN5949 - PRAC/INTERN/COOP WORK", EGN5949);

        return spring_courses;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addItemsOnspinner1();
        addItemsOnspinner2();
        addItemsOnspinner3();
    }


    public void addItemsOnspinner1() {

        spinner1 = (Spinner) findViewById(R.id.spinner1_Department);
        
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.department, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinnerListener1 = new CustomOnItemSelectedListener();
        spinner1.setOnItemSelectedListener(spinnerListener1);
    }

    public void addItemsOnspinner2() {

        spinner2 = (Spinner) findViewById(R.id.spinner2_program);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.program, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);
        spinnerListener2 = new CustomOnItemSelectedListener();
        spinner2.setOnItemSelectedListener(spinnerListener2);
    }

    public void addItemsOnspinner3() {

        spinner3 = (Spinner) findViewById(R.id.spinner3_sem);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.semester, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter);
        spinnerListener3 = new CustomOnItemSelectedListener();
        spinner3.setOnItemSelectedListener(spinnerListener3);
    }

    public void onSubmit(View view){

        String department = spinnerListener1.getValue();
        String program = spinnerListener2.getValue();
        String sem = spinnerListener3.getValue();

        String course_no = ((TextView)findViewById(R.id.user_input)).getText().toString();

        Context context = this;
        Class destinationClass = CourseInfoActivity.class;
        Intent intentToStartDetailActivity = new Intent(context, destinationClass);
        intentToStartDetailActivity.putExtra("department", department);
        intentToStartDetailActivity.putExtra("program", program);
        intentToStartDetailActivity.putExtra("sem", sem);

        HashMap<String, List<String>> matched_courses =  new HashMap<>();;

        if (course_no != null && !course_no.isEmpty()) {

            HashMap<String, List<String>> Courses = new HashMap<>();

            if (sem.equals("Spring")) {

               Courses = SpringCourses();
            }
            else if (sem.equals("Fall")) {

              Courses = FallCourses();
            }

            for (String course: Courses.keySet()){

                if (course.matches( "[\\s\\S]*" + course_no +  "[\\s\\S]*")) {

                    matched_courses.put(course, Courses.get(course));

                }
            }

            if (matched_courses.isEmpty()) {
                Toast.makeText(this, "Wrong Course Number", Toast.LENGTH_LONG).show();
                return;
            }
        }

        else if (sem.equals("Spring"))
            matched_courses = SpringCourses();

        else if (sem.equals("Fall"))
            matched_courses = FallCourses();

        intentToStartDetailActivity.putExtra("MatchedCourses", matched_courses);
        startActivity(intentToStartDetailActivity);
    }

    class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener {

        private String value;

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            value = parent.getItemAtPosition(position).toString();
        }

        public String getValue(){

            return value;
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
