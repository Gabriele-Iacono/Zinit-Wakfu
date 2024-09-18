package com.iacono.app.Zinit.repository;

import com.iacono.app.Zinit.models.Item;
import com.iacono.app.Zinit.models.Slot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
   List<Item> findBySlotId (Slot slotId);
    List<Item> findBySlotId_Name (String slotName);

}
