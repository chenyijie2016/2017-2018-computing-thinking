package info.smartkit.godpaper.go.settings;

/**
 * Created by smartkit on 22/06/2017.
 */
public enum UserStatus {
        unTENANTED("untenanted", 0), STANDBY("standby", 2), PLAYING("playing", 3),TENANTED("tenanted",1);

        UserStatus(String name, int index) {
                this.name = name;
                this.index = index;
        }

        private String name;
        private int index;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getIndex() {
                return index;
        }

        public void setIndex(int index) {
                this.index = index;
        }

        @Override public String toString() {
                return "UserStatus{" + "name='" + name + '\'' + ", index=" + index + '}';
        }
}
