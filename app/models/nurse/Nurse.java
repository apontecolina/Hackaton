package models.nurse;

import com.fasterxml.jackson.databind.node.ObjectNode;
import models.WorkShift;
import models.WorkUnit;
import play.libs.Json;

public class Nurse {

    private long id;
    private String name;
    private WorkUnit workUnit;
    private WorkShift workShift;

    public Nurse(long id, String name, WorkUnit workUnit, WorkShift workShift) {
        this.id = id;
        this.name = name;
        this.workUnit = workUnit;
        this.workShift = workShift;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkUnit getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(WorkUnit workUnit) {
        this.workUnit = workUnit;
    }

    public WorkShift getWorkShift() {
        return workShift;
    }

    public void setWorkShift(WorkShift workShift) {
        this.workShift = workShift;
    }
}
