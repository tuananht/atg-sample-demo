import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_stale-element-when-handling-a-5'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/stale-element-when-handling-a-table/83190/5')

'step 2: Add visual checkpoint at Page_t_stale-element-when-handling-a-5'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01176_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
