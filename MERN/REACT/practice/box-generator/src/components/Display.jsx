

const Display = ({color,size}) => {

    return (
        <div
          style={{
            width:` ${size}px`,
            height: ` ${size}px`,
            backgroundColor:color,
            display: 'inline-block',
            marginRight: '10px',
            marginTop:'10px'
          }}
        />
      );
    };

export default Display