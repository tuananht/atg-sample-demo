import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_pulling-information-from-a-table'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/pulling-information-from-a-table/48282')

'step 2: Add visual checkpoint at Page_t_pulling-information-from-a-table'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00854_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
