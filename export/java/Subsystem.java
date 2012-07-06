package ${package}.subsystems;
#set($subsystem = $helper.getByName($subsystem, $robot))

import ${package}.RobotMap;
import ${package}.commands.*;
${helper.getImports($subsystem, "RobotMap")}
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class #class($subsystem.name) extends Subsystem {
#@autogenerated_code("declarations", "    ")
#foreach ($component in $components)
#if ($component.subsystem == $subsystem.subsystem && $component != $subsystem)
    ${helper.classOf($component)} #variable($component.name) = RobotMap.#constant($component.fullName);
#end
#end
#end

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
#@autogenerated_code("default_command", "        ")
#if ($subsystem.getProperty("Default Command") != "None")
        setDefaultCommand(new #class($subsystem.getProperty("Default Command"))());
#end
#end
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

