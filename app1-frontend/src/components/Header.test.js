process.env.CI = true
import React from 'react';
import { shallow } from 'enzyme';
import { configure } from "enzyme";
import Adapter from "enzyme-adapter-react-16";

configure({ adapter: new Adapter() });
import ComponentName from './HeaderComponent';

describe("ComponentName",()=> {
  it("should render my component", ()=> {
    const wrapper = shallow(<ComponentName />);
  });
});