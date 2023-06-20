import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_automate-right-click-then-select-inspect'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/automate-right-click-then-select-inspect/55484')

'step 2: Add visual checkpoint at Page_t_automate-right-click-then-select-inspect'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00668_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
