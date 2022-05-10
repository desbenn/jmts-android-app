package jm.com.dpbennett.myjmts.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Job {

    @PrimaryKey(autoGenerate = true)
    public long jid;
    @ColumnInfo(name = "job_number")
    public String jobNumber;
    @ColumnInfo(name = "date_submitted")
    public Date dateSubmitted;
    @ColumnInfo(name = "job_sequence_number")
    public Long jobSequenceNumber;
    @ColumnInfo(name = "comment")
    public String comment;
    @ColumnInfo(name = "classification")
    public String classification;
    @ColumnInfo(name = "department")
    public String department;
    @ColumnInfo(name = "year_received")
    public int yearReceived;
    @ColumnInfo(name = "client")
    public String client;
    @ColumnInfo(name = "job_description")
    public String jobDescription;
    @ColumnInfo(name = "instructions")
    public String instructions;

    @Override
    public String toString() {
        return "Job{" +
                " jid=" + jid +
                ", jobNumber='" + jobNumber + '\'' +
                ", dateSubmitted=" + dateSubmitted +
                '}';
    }
}
