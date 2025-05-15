import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

...

Logger logger_parent = LoggerFactory.getLogger("parent");
Logger logger_child = LoggerFactory.getLogger("parent.child");