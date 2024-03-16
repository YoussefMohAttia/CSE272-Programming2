package final_lab;

import java.util.ArrayList;
import java.util.List;

public class ShapesData implements Iterator {
        private int count = 0;
        private ArrayList<Shape> data = new ArrayList<Shape>();
        @Override
        public boolean hasNext() {
            if (count < data.size()) {
                return true;
            }
            count=0;
            return false;
        }
        @Override
        public Shape get(int i) {
            return data.get(i);
        }        
        @Override
        public List List() {
            return data;
        }        
        @Override
        public Shape next() {
            if (this.hasNext()) {
                return data.get(count++);
            }
            return null;
        }
        @Override
        public void Add(Shape o) {
            data.add(o);
        }
        @Override
        public void Remove(Shape i) {
            data.remove(i);
        }
    
}
