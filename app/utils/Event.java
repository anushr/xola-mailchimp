package utils;

/**
 * @author rishabh
 */
public final class Event {

    public static final String ALL = "*";
    public static final String EXPERIENCE_CREATE = "experience.create";
    public static final String EXPERIENCE_DELETE = "experience.delete";
    public static final String EXPERIENCE_UPDATE = "experience.update";
    public static final String ORDER_CREATE = "order.create";
    public static final String ORDER_UPDATE = "order.update";
    public static final String USER_AGENT_CREATE = "user.agent.create";
    public static final String USER_AGENT_REMOVE = "user.agent.remove";
    public static final String USER_AGENT_UPDATE = "user.agent.update";
    public static final String USER_UPDATE = "user.update";
    public static final String INSTALLATION_CREATE = "installation.create";
    public static final String INSTALLATION_UPDATE = "installation.update";
    public static final String INSTALLATION_DELETE = "installation.delete";
    // Old events are kept for backwards compatibility. They can be removed after Legolas update.
    public static final String PLUGIN_INSTALL = "plugin.install";
    public static final String PLUGIN_CONFIG_UPDATE = "plugin.config.update";
    public static final String PLUGIN_UNINSTALL = "plugin.uninstall";
}
