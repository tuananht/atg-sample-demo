import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_auctions_auctionname01-010623_htkvb1ids3v6vhdeijah0g_buy-bid'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/auctions/auctionname01-010623/htkvb1ids3v6vhdeijah0g/buy-bid')

'step 2: Add visual checkpoint at Page_auctions_auctionname01-010623_htkvb1ids3v6vhdeijah0g_buy-bid'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00013_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
