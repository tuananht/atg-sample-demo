import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_change-display-element-from-none-to-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/change-display-element-from-none-to-block/11979/6')

'step 2: Add visual checkpoint at Page_t_change-display-element-from-none-to-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01121_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
