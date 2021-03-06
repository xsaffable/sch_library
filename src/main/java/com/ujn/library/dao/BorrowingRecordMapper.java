package com.ujn.library.dao;

import com.ujn.library.entity.Book;
import com.ujn.library.entity.BorrowBook;
import com.ujn.library.entity.BorrowingRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BorrowingRecordMapper {

    List<String> getBookIdsByUserId(String user_id) throws Exception;

    List<Book> getBooksByUserId(String user_id, int start, int pageSize) throws Exception;

    void borrowBook(BorrowingRecord borrowingRecord) throws Exception;

    void backBook(BorrowingRecord borrowingRecord) throws Exception;

    int count(String user_id) throws Exception;

    int onCount(String user_id) throws Exception;

    /**
     * 按分页获取不区分是否在借的书籍ID
     * @param start
     * @param pageSize
     * @return
     * @throws Exception
     */
    List<String> getBorrowBookIds(@Param("start") int start, @Param("pageSize") int pageSize, @Param("user_id") String user_id) throws Exception;

    /**
     * 获得某个人的借阅历史
     * @param start
     * @param pageSize
     * @param user_id
     * @return
     * @throws Exception
     */
    List<BorrowBook> getBorrHistory(@Param("start") int start, @Param("pageSize") int pageSize, @Param("user_id") String user_id) throws Exception;

    int countAll(String user_id) throws Exception;

}
