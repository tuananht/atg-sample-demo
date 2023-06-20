import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_is-there-a-way-to-interact-with-a-browser-object-and-access-its-properties-such-as-visibleonscreen-or-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/is-there-a-way-to-interact-with-a-browser-object-and-access-its-properties-such-as-visibleonscreen-or-objectidentifier/6148/2')

'step 2: Add visual checkpoint at Page_t_is-there-a-way-to-interact-with-a-browser-object-and-access-its-properties-such-as-visibleonscreen-or-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00240_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
