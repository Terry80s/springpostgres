package jp.co.crk.controller;


import jp.co.crk.Application;
import jp.co.crk.Exception.ResourceNotFoundException;
import jp.co.crk.model.Staff;
import jp.co.crk.repository.StaffRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class StaffController {

    public static final Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    private StaffRepository staffRepository;

    @GetMapping("/staffs")
    public List<Staff> getAllStaffs() {
        logger.info("Get all the staffs...");
        return staffRepository.findAll();
    }

    @GetMapping("/staffs/{id}")
    public ResponseEntity<Staff> getStaffById(@PathVariable(value = "id") long staffId) throws ResourceNotFoundException {
        logger.info("Get staff by id...");
        Staff staff = staffRepository.findById(staffId).orElseThrow(() -> new ResourceNotFoundException("Staff not found for this id:: " + staffId));
        return ResponseEntity.ok().body(staff);

    }

    @PostMapping("/staffs")
    public Staff createStaff(@RequestBody Staff staff) {
        logger.info("Insert staff...");
        return staffRepository.save(staff);
    }

    @PutMapping("/staffs/{id}")
    public ResponseEntity<Staff> StaffById(@PathVariable(value = "id") long staffId, @RequestBody Staff updatedStaff) throws ResourceNotFoundException {
        logger.info("Update staff...");
        Staff staff = staffRepository.findById(staffId).orElseThrow(() -> new ResourceNotFoundException("Staff not found for this id:: " + staffId));
        staff.setFirstName(updatedStaff.getFirstName());
        staff.setLastName(updatedStaff.getLastName());
        staffRepository.save(staff);
        return ResponseEntity.ok().body(staff);

    }

    @DeleteMapping("/staffs/{id}")
    public void deleteStaff(@PathVariable(value = "id") long staffId) throws ResourceNotFoundException {
        logger.info("Delete staff...");
        Staff staff = staffRepository.findById(staffId).orElseThrow(() -> new ResourceNotFoundException("Staff not found for this id:: " + staffId));
        staffRepository.delete(staff);
    }

}
