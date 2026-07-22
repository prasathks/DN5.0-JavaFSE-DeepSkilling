import React from 'react';

const withLogger = (WrappedComponent) => {
  return class extends React.Component {
    componentDidMount() {
      console.log(Component  Mounted with props:, this.props);
    }
    
    componentWillUnmount() {
      console.log(Component  will unmount);
    }

    render() {
      return (
        <div className='hoc-wrapper' style={{ border: '1px solid gray', padding: '10px' }}>
          <p><em>HOC Logger Active</em></p>
          <WrappedComponent {...this.props} />
        </div>
      );
    }
  };
};

export default withLogger;
