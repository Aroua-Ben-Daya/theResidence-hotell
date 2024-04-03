package org.arouabendaya.theresidencehotel.repository;

import org.arouabendaya.theresidencehotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room,Long> {

    @Query("SELECT distinct r.roomType from Room r")
    List<String> findDistincRoomTypes();
}

