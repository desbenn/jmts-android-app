package jm.com.dpbennett.myjmts.entity;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface JobDAO {
    @Query("SELECT * FROM job")
    List<Job> getAll();

    @Query("SELECT * FROM job WHERE jid IN (:jobIds)")
    List<Job> loadAllByIds(long[] jobIds);

    @Query("SELECT * FROM job WHERE job_number LIKE :jobNumber LIMIT 1")
    Job findByJobNumber(String jobNumber);

    @Insert
    void insertAll(Job... jobs);

    @Delete
    void delete(Job job);

    @Update
    void update(Job job);

}
