package com.example.recyclerview.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.activity.Model.Buku
import com.example.recyclerview.adapter.RowListAdapter
import com.example.recyclerview.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var rowListAdapter: RowListAdapter? = null
    private var dataDummy: ArrayList<Buku>? = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Call function
        addingRowList()

        //Using ?.let for allow null if dataDummy is null
        dataDummy?.let {

            //Initialize RowListAdapter, fill data inside it and implement adapter in recycler view
            rowListAdapter = RowListAdapter()
            rowListAdapter?.addDataList(it)
            recyclerView.setHasFixedSize(true)
            recyclerView.isNestedScrollingEnabled = true
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = rowListAdapter
        }
    }

    /**
     * Function for Store data dummy in ArrayList<Book>
     */
    private fun addingRowList() {
        dataDummy?.add(Buku("Yosteven", "Development Android", 1234567890))
        dataDummy?.add(Buku("Stefanus", "Android Architecture", 10987654321))
        dataDummy?.add(Buku("Antonius", "Android Data Binding", 98765432))
        dataDummy?.add(Buku("Yosteven", "Development Android", 1234567890))
        dataDummy?.add(Buku("Stefanus", "Android Architecture", 10987654321))
        dataDummy?.add(Buku("Antonius", "Android Data Binding", 98765432))
        dataDummy?.add(Buku("Yosteven", "Development Android", 1234567890))
        dataDummy?.add(Buku("Stefanus", "Android Architecture", 10987654321))
        dataDummy?.add(Buku("Antonius", "Android Data Binding", 98765432))
        dataDummy?.add(Buku("Yosteven", "Development Android", 1234567890))
        dataDummy?.add(Buku("Stefanus", "Android Architecture", 10987654321))
        dataDummy?.add(Buku("Antonius", "Android Data Binding", 98765432))
        dataDummy?.add(Buku("Yosteven", "Development Android", 1234567890))
        dataDummy?.add(Buku("Stefanus", "Android Architecture", 10987654321))
        dataDummy?.add(Buku("Antonius", "Android Data Binding", 98765432))
    }
}
