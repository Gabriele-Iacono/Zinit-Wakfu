package com.iacono.app.Zinit.controllers;

import com.iacono.app.Zinit.models.Item;
import com.iacono.app.Zinit.models.PageDTO;
import com.iacono.app.Zinit.models.Slot;
import com.iacono.app.Zinit.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/item")
    public ResponseEntity<PageDTO<Item>> getAllItems(@RequestParam(defaultValue = "0") int page,
                                                     @RequestParam(defaultValue = "10") int size
    ) {
        PageDTO<Item> items = itemService.getAllItems(page, size);
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @GetMapping("/item/filter")
    public ResponseEntity<PageDTO<Item>> getItemsBySlot(@RequestParam Slot slot,
                                                        @RequestParam(defaultValue = "0") int page,
                                                        @RequestParam(defaultValue = "10") int size) {
        PageDTO<Item> items = itemService.getItemsBySlot(slot, page, size);
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @GetMapping("item/slot")
    public ResponseEntity<List<Item>> getItemsBySlotName(@RequestParam String slotName) {
        List<Item> items = itemService.getItemsBySlotName(slotName);
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
}
