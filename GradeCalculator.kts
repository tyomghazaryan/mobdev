import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvParticipation: TextView
    private lateinit var tvHomework: TextView
    private lateinit var tvGroupPresentation: TextView
    private lateinit var tvMidtermExam1: TextView
    private lateinit var tvMidtermExam2: TextView
    private lateinit var tvFinalProject: TextView

    private lateinit var btnAddHomework: Button
    private lateinit var btnResetHomework: Button
    private lateinit var btnCalculate: Button

    private var participationGrade = 100
    private var homeworkGrade = 100
    private var groupPresentationGrade = 100
    private var midtermExam1Grade = 100
    private var midtermExam2Grade = 100
    private var finalProjectGrade = 100

    private var homework1Grade = 0
    private var homework2Grade = 0
    private var homework3Grade = 0
    private var homework4Grade = 0
    private var homework5Grade = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvParticipation = findViewById(R.id.tv_participation)
        tvHomework = findViewById(R.id.tv_homework)
        tvGroupPresentation = findViewById(R.id.tv_group_presentation)
        tvMidtermExam1 = findViewById(R.id.tv_midterm_exam_1)
        tvMidtermExam2 = findViewById(R.id.tv_midterm_exam_2)
        tvFinalProject = findViewById(R.id.tv_final_project)

        btnAddHomework = findViewById(R.id.btn_add_homework)
        btnResetHomework = findViewById(R.id.btn_reset_homework)
        btnCalculate = findViewById(R.id.btn_calculate)

        btnAddHomework.setOnClickListener {
            addHomeworkGrade()
        }

        btnResetHomework.setOnClickListener {
            resetHomeworkGrades()
        }

        btnCalculate.setOnClickListener {
            calculateFinalGrade()
        }
    }

    private fun addHomeworkGrade() {
        // Code to add homework grade and update UI
        // You can prompt user to enter grade and update corresponding homework grade variable
    }

    private fun resetHomeworkGrades() {
        // Code to reset all homework grades to 0 and update UI
        homework1Grade = 0
        homework2Grade = 0
        homework3Grade = 0
        homework4Grade = 0
        homework5Grade = 0
        tvHomework.text = "Homework assignments: 100"
    }

    private fun calculateFinalGrade() {
        // Code to calculate final grade based on all criteria and display it on UI
        val finalGrade = (participationGrade * 0.1) +
                (homeworkGrade * 0.2) +
                (groupPresentationGrade * 0.1) +
                (midtermExam1Grade * 0.1) +
                (midtermExam2Grade * 0.2) +
                (finalProjectGrade * 0.3)

        tvParticipation.text = "Participation and attendance: $participationGrade"
        tvHomework.text = "Homework assignments: $homeworkGrade"
        tvGroupPresentation.text = "Group Presentation: $groupPresentationGrade"
        tvMidtermExam1.text = "Midterm Exam 1: $midtermExam1Grade"
        tvMidtermExam2.text = "Midterm Exam 2: $midtermExam2Grade"

