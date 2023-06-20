import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_website-wont-load-when-using-chrome-in-record-web'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/website-wont-load-when-using-chrome-in-record-web/68810')

'step 2: Add visual checkpoint at Page_t_website-wont-load-when-using-chrome-in-record-web'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00947_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
