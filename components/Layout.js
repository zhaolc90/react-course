// import styles from './layout.module.css'

export default function Layout({ children }) {
  return (
  <>
  <div 
//   className={styles.container}
className="left-padding"
  >{children}</div>
  
  <style jsx>{`
    .left-padding:{
        padding: 100px,
    }
  `}
  </style>
  </>)
}
