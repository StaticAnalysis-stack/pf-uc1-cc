import Adapter from "enzyme-adapter-react-16";
configure({ adapter: new Adapter() });
import ComponentName from './App';

describe("ComponentName",()=> {
  it("should render my component", ()=> {
    const wrapper = shallow(<ComponentName />);
  });
});