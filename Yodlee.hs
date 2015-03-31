


module Yodlee where

 import Data.Aeson	((.:), (.:?), decode, FromJSON(..), Value(..))
 import Control.Applicative	((<$>, <*>))
 import Data.Time.Format	(parseTime)
 import Data.Time.Clock		(UTCTime) 
 import System.Locale	(defaultTimeLocale)
 import Control.Monad	(liftM)
 import Data.Attrparsec.Number	(Number(..))
 import qualified  Data.HashMap.Strict as HM
 import qualified Data.BtyeString.Lazy.Char8 as BS

  parseRHTime :: String -> Maybe UTCTime
  parseRHTime = parseTime defaultTimeLocale "%FT%X%QZ"
   
   data Paste = Paste {getLines :: Interger 
			, getDate :: Maybe UTCTime 
			, getClientID :: Interger 
			, getLanguage :: String 
			, getPrivate :: Bool
'			, getURL :: String 
			, getUser :: Maybe String
			, getBody :: String
			, getLikes :: String 
} deriving (Show)

   data Yodlee = Yodlee { getDate :: Maybe UTCTime 
			, getCobToken :: Interger 
			, getLogin :: String 
			, getPassword :: Bool
'			, getURL :: String 
			, getSearchString :: Maybe String
			, getSiteID :: Integer
			, getCategory :: String 
			, getTransactions :: String
			, getTransactionID :: Integer
			, getAccountID :: Interger
			, getBatchID :: Interger
		<D-j>	, getInvoiceID :: Interger
			, getAccountID :: Interger  
			
} deriving (Show)




   instance FromJSON Paste where
	parseJSON (Object v ) = 
	  Paste <$> 
	  (v .: "Date")  <*>
	  (v .: "CobToken") <*>
	  (v .: "Login") <*>
	  (v .: "Password") <*>
	  (v .: "URL")	<*>
	  (v :? "SearchString") <*>
	  (v .: "SiteID") <*>
	  (v .: "Category") <*>
	  (v .: "Transactions") <*>
	  (v .: "TransactionID") <*>
	  (v .: "AccountID") <*>
	  (v .: "BatchID") <*>
	  (v .: "InvoiceID") <*>
	  (v .: "AccountID") <*>




   getRHLines :: String -> Integer
   getRHLines fbjson = 
	case HM.lookup "User" hm of 
	   Just (Number (I n)) -> n 
	   Nothing	-> error "Your missing a number"
	where (Just (Object hm)) = decode (YE.pack fbjson) :: Maybe Value

