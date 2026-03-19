package com.example.warehouse_inventory_system.service;

import com.example.warehouse_inventory_system.entity.Warehouse;
import com.example.warehouse_inventory_system.repository.WarehouseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {

    private final WarehouseRepository warehouseRepository;

    public WarehouseService(WarehouseRepository warehouseRepository){
        this.warehouseRepository = warehouseRepository;
    }

    public Warehouse saveWarehouse(Warehouse warehouse){
        return warehouseRepository.save(warehouse);
    }

    public List<Warehouse> getAllWarehouses(){
        return warehouseRepository.findAll();
    }

    public void deleteWarehouse(Long id){
        warehouseRepository.deleteById(id);
    }
}