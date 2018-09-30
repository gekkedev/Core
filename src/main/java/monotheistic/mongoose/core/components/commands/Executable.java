package monotheistic.mongoose.core.components.commands;

import org.bukkit.command.CommandSender;

import java.util.List;

public interface Executable {

    boolean execute(CommandSender sender, String cmd, String[] args, PluginInfo pluginInfo, List<Object> objs);

}
