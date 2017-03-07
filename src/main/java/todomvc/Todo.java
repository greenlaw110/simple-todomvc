package todomvc;

import act.Act;
import act.controller.Controller;
import act.db.morphia.MorphiaAdaptiveRecord;
import act.db.morphia.util.MorphiaAdaptiveRecordRestfulServiceBase;
import org.mongodb.morphia.annotations.Entity;

@Entity(value = "todo", noClassnameStored = true)
public class Todo extends MorphiaAdaptiveRecord<Todo> {

    @Controller("/todo")
    public static class Service extends MorphiaAdaptiveRecordRestfulServiceBase<Todo> {}

    public static void main(String[] args) throws Exception {
        Act.start("TODO MVC LITE");
    }

}