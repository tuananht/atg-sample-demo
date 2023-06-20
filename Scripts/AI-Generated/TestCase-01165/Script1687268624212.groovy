import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_u_russ_thomas_follow_followers'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/u/russ_thomas/follow/followers')

'step 2: Add visual checkpoint at Page_u_russ_thomas_follow_followers'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01165_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
