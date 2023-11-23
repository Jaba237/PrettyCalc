package cmr.the_ak.porfolio_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //saveInstanceState: Bundle? is used to save the context of the app so that it should be quickly displayed
        //setContentView(R.layout.activity_main) give the xml file related to this code

        //Variable declaration is with the keyword "var"
        //constant declaration is with keyword "val"
        //No semi colon are needed at the end of an instruction
        //Creating an onclick intent which

        //Implicite intent : When action leads you to an activity in th same app
        //Action like : displaying contact information in a contact management app
        //Explicite intent : When an action leads you to an activity in another app
        //Action like openning a file from an app by another app


        val buttonSkills = findViewById<Button>(R.id.btnSkills)


        buttonSkills.setOnClickListener{
            intent = Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }

        val buttonEducation_Detail = findViewById<Button>(R.id.btnEducation)

        buttonEducation_Detail.setOnClickListener{
            intent = Intent(this,Education_Detail::class.java)
            startActivity(intent)
        }

        val buttonWork = findViewById<Button>(R.id.btnWork)

        buttonWork.setOnClickListener{

            intent = Intent(this,Work::class.java)
            startActivity( intent)
        }

        val buttonAchievements_Activity = findViewById<Button>(R.id.btnAcheivement)

        buttonAchievements_Activity.setOnClickListener(){

            intent = Intent(this,Achievements_Activity::class.java)
            startActivity(intent)


        }



    }
}