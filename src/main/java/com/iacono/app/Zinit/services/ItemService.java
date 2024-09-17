package com.iacono.app.Zinit.services;

import com.iacono.app.Zinit.models.Item;
import com.iacono.app.Zinit.models.PageDTO;
import com.iacono.app.Zinit.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public PageDTO<Item> getAllItems(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Item> items = itemRepository.findAll(pageable);

        PageDTO<Item> pageDTO = new PageDTO<>();
        pageDTO.setContent(items.getContent());
        pageDTO.setPageNumber(items.getNumber());
        pageDTO.setPageSize(items.getSize());
        pageDTO.setTotalElements(items.getTotalElements());
        pageDTO.setTotalPages(items.getTotalPages());

        return pageDTO;

    }
}
